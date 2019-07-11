This is an example project to illustrate the use of awips2-core in a native Android app.

**WARNING** -- at the moment, **this doesn't work**. After days and days of effort, I finally got
awips2-core to compile without errors... then had it blow up when I tried to actually USE it under
Android because awips2-core demands JAXB... and (officially, at least) JAXB doesn't appear to work
under Android. (facepalm). 

I haven't quite given up yet... I'm still hoping I can either get JAXB
to work directly with Android (memory requirements and performance be damned), or eliminate
awips2-core's dependency on it without having to spend weeks rewriting major chunks of it.

Note that my fork of awips2-core is absolutely **identical** to Unidata's, with  the sole exception
of the build.gradle file I added (and which this example project depends upon). If my repo falls
behind Unidata's and you want to use their newer one, just clone theirs instead & add a copy of
**my** awips2-core/build.gradle to it.

Do not assume that anything in this project is a *good* practice, let alone a *best* practice.
This is literally a documented first attempt to get it to work, in the most expedient, quick, and
dirty manner possible. Treat any example code like the ugly prototype it is.

Eventually, when I get everything working, I'm planning to publish the built awips2-core library and
its dependencies to Bintray/Jcenter as a ready-to-use Gradle dependency to make it easier for others
to use.

Note: if you get build errors, make sure there are directories for awips2-core and awips2-core-foss
present in the project's main directory & that they're non-empty.

If you don't see them, cd to your project's root directory, then execute the following:

    git clone https://github.com/jskubick/awips2-core
    git clone https://github.com/unidata/awips2-core-foss