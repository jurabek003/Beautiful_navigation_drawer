package uz.turgunboyevjurabek.beautifulnavigationdrawer.domein.models

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector

enum class NavigationItem(
    val title:String,
    val icon:ImageVector
) {

    Home(
        icon = Icons.Default.Home,
        title ="Home"
    ),
    Profile(
        icon = Icons.Default.Person,
        title ="Profile"
    ),
    Star(
        icon = Icons.Default.Star,
        title ="Star"
    ),
    Settings(
        icon = Icons.Default.Settings,
        title ="Settings"
    )


}