package io.yard.module.zik

import play.api._
import play.api.mvc._
import play.api.libs.json._
import play.api.libs.functional.syntax._

import io.yard.module.core.Api
import io.yard.common.models._

object ZikController
    extends io.yard.common.models.ModuleController
    with ZikConfig {

  lazy val logger = initLogger("yardio.modules.zik.controller")

  def hasRoute(rh: RequestHeader) = true

  def applyRoute[RH <: RequestHeader, H >: Handler](rh: RH, default: RH ⇒ H) =
    (rh.method, rh.path.drop(path.length)) match {
      case ("GET", "")  ⇒ Action { Ok("JIRA plugin is currently running...") }
      case ("POST", "") ⇒ Action { Ok("JIRA plugin is currently running...") }
      case _            ⇒ default(rh)
    }
}
