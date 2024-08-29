@file:OptIn(ExperimentalMaterial3Api::class)

package uz.turgunboyevjurabek.beautifulnavigationdrawer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import uz.turgunboyevjurabek.beautifulnavigationdrawer.presentation.view.MainScreen
import uz.turgunboyevjurabek.beautifulnavigationdrawer.ui.theme.BeautifulNavigationDrawerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BeautifulNavigationDrawerTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                  /*  topBar = {
                        TopAppBar(
                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = MaterialTheme.colorScheme.tertiaryContainer
                            ),
                            title = {
                            Text(
                                text = "My topAppBar",
                                fontSize = MaterialTheme.typography.titleMedium.fontSize
                            ) },
                            navigationIcon = {
                                IconButton(onClick = {}) {
                                    Icon(imageVector = Icons.Default.Menu, contentDescription = null)
                                }
                            }
                        )
                    }
                   */
                ) { innerPadding ->
                    MainScreen(modifier = Modifier.padding(paddingValues = innerPadding))
                }
            }
        }
    }
}
