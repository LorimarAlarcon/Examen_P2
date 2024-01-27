package cl.lorimaralarcon.ef_p2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import cl.lorimaralarcon.ef_p2.ui.composable.AppRegistrosUI


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppRegistrosUI()
        }
    }
}