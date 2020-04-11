package crestedbutte.dom

import org.scalajs.dom.html.Div
import scalatags.JsDom

object Bulma {
  import scalatags.JsDom.all._

  def bulmaModal(content: JsDom.TypedTag[Div],
                 idValue: String): JsDom.TypedTag[Div] =
    div(id := idValue, cls := "modal")(
      div(cls := "modal-background")(),
      div(cls := "modal-content",
          backgroundColor := "rgba(68, 68, 68, 1.0)",
          marginLeft := "45px",
          marginRight := "45px")(
        content,
      ),
      button(cls := "modal-close is-large", aria.label := "close")(),
    )

  def menu(choices: Seq[JsDom.TypedTag[Div]]) =
    div(id := "main-menu",
        cls := "navbar",
        role := "navigation",
        aria.label := "main navigation")(
      div(cls := "navbar-brand")(
        a(role := "button",
          cls := "navbar-burger burger",
          aria.label := "menu",
          aria.expanded := "false",
          data("target") := "navbarBasicExample")(
          span(aria.hidden := "true"),
          span(aria.hidden := "true"),
          span(aria.hidden := "true"),
        ),
      ),
      div(id := "navbarBasicExample", cls := "navbar-menu")(
        div(cls := "navbar-start")(
          div(cls := "navbar-item has-dropdown is-hoverable")(
            a(cls := "navbar-link")("Restaurants"),
            div(cls := "navbar-dropdown")(
              choices
            ),
          ),
        ),
        div(cls := "navbar-end")(
          ),
      ),
    )

}