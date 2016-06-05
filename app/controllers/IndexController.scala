package controllers

import play.api.mvc.Action
import play.api.mvc.Controller
import helpers.Auth0Config

object IndexController extends Controller {

  def index = Action {
    Ok(views.html.index(Auth0Config.get()))
  }

}