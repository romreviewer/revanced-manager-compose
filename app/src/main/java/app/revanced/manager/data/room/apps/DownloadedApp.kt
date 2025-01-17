package app.revanced.manager.data.room.apps

import androidx.room.ColumnInfo
import androidx.room.Entity
import java.io.File

@Entity(
    tableName = "downloaded_app",
    primaryKeys = ["package_name", "version"]
)
data class DownloadedApp(
    @ColumnInfo(name = "package_name") val packageName: String,
    @ColumnInfo(name = "version") val version: String,
    @ColumnInfo(name = "file") val file: File,
)