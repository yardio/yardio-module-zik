package io.yard.module.zik

import akka.actor.Props

import io.yard.module.core.Api

class ZikPlugin(application: play.api.Application) extends play.api.Plugin {
  override def onStart = {
    Api.registerModule(
      "zik",
      "Seach, listen, enjoy... anywhere, anytime",
      None,
      Some(Props[Zaktor])
    )
  }
}
