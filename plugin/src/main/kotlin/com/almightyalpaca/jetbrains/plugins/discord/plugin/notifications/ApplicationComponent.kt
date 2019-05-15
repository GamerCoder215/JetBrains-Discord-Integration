package com.almightyalpaca.jetbrains.plugins.discord.plugin.notifications

import com.almightyalpaca.jetbrains.plugins.discord.plugin.utils.Application
import com.intellij.openapi.components.BaseComponent

interface ApplicationNotificationComponent : BaseComponent

val notifications: ApplicationNotificationComponent by lazy { Application.instance.getComponent(ApplicationNotificationComponent::class.java) }
