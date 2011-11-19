package $package$

import com.github.jbrechtel.robospecs.RoboSpecs
import com.xtremelabs.robolectric.RobolectricConfig
import org.specs2.mock.Mockito

class $main_activity$Spec extends RoboSpecs with Mockito {
  args(sequential = true)

  override lazy val robolectricConfig = new RobolectricConfig(new java.io.File("."))
  
  "onCreate" should {
    "set the content view" in {
      val activity = new $main_activity$()
      activity.onCreate(null)
      activity.findViewById(R.id.message) must not beNull
    }
  }
}