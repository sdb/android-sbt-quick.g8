package $package$

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class $main_activity$ extends Activity {
  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(new TextView(this) {
      setText("Hello, world!")
    })
  }
}
