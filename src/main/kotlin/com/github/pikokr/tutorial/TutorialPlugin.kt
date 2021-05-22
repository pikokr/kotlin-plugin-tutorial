package com.github.pikokr.tutorial

import net.kyori.adventure.text.Component
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin

class TutorialPlugin : JavaPlugin(), Listener {
    override fun onEnable() {
        logger.info("튜토리얼 플러그인이 활성화되었습니다")
        server.pluginManager.registerEvents(this, this)
    }

    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        event.joinMessage(Component.text("${event.player.name}님 서버에 오신것을 환영합니다!"))
    }
}