package com.momokosaa.nottosdk.notto_sdk

import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.widget.Toast


class MyMain {

    fun ToastVersion(c: Context){
        Toast.makeText(c, "Welcome to NottoSDK", Toast.LENGTH_SHORT).show()
    }

    fun getVersionName(c: Context): String {
        var versionName = ""
        try {
            val pInfo: PackageInfo = c.packageManager.getPackageInfo(c.packageName, 0)
            versionName = pInfo.versionName
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
        return versionName
    }

    fun getPackageName(c: Context): String {
        var packageName = ""
        try {
            val pInfo: PackageInfo = c.packageManager.getPackageInfo(c.packageName, 0)
            packageName = pInfo.packageName
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
        return packageName
    }
}