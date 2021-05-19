package com.github.pikokr.tutorial

import org.bukkit.plugin.java.JavaPlugin

class TutorialPlugin : JavaPlugin() {
    override fun onEnable() {
        logger.info("튜토리얼 플러그인이 로딩되었습니다")
    }
}