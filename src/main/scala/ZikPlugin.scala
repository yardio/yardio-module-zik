package io.yard.zik

import akka.actor.Props

import io.yard.core.Api

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
