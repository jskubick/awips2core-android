package awips2.core.android.example;

import android.widget.Toast;

import com.raytheon.uf.common.dataaccess.DataAccessLayer;
import com.raytheon.uf.common.dataaccess.request.GetGeometryDataRequest;
import com.raytheon.uf.common.serialization.comm.IServerRequest;
import com.raytheon.uf.viz.core.exception.VizException;
import com.raytheon.uf.viz.core.requests.ThriftClient;

public class AwipsClient {
	public static void doSomethingAwipsRelated() {
		String[] supportedDataTypes = DataAccessLayer.getSupportedDatatypes();
		for (String s : supportedDataTypes)
			System.out.println("Supported datatype: " + s); // god, I miss .Net $"{value}" String interpolation
	}

	private void eventuallyhDoSomethingAwipsRelated() {
		// @ToDo: request type needs a registered handler.
		IServerRequest request = new GetGeometryDataRequest();
		try {
			ThriftClient.sendRequest(request);
			System.out.println("Successfully made request");
		}
		catch (VizException e) {
			throw new RuntimeException(e);
		}

	}
}
