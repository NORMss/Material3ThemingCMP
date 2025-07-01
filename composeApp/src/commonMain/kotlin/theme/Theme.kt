package theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

val LightColorTheme = lightColorScheme(
    primary = Primary,
    surface = Surface,
    surfaceContainerLowest = SurfaceLowest,
    background = Background,
    onSurface = OnSurfaceVariant,
)

val DarkColorTheme = darkColorScheme(
    primary = Primary,
    surface = Surface,
    surfaceContainerLowest = SurfaceLowest,
    background = Background,
    onSurface = OnSurfaceVariant,
)

@Composable
fun AppTheme(
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = if (isSystemInDarkTheme()) DarkColorTheme else LightColorTheme,
        content = content
    )
}