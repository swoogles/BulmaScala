package crestedbutte.dom

import org.scalajs.dom.html.{Anchor, Div}
import scalatags.JsDom

object Bulma {
  import scalatags.JsDom.all._

  def modal(content: JsDom.TypedTag[Div],
            idValue: String): JsDom.TypedTag[Div] =
    div(id := idValue, cls := "modal")(
      div(cls := "modal-background")(),
      div(cls := "modal-content",
          marginLeft := "45px",
          marginRight := "45px")(
        content,
      ),
      button(cls := "modal-close is-large", aria.label := "close")(),
    )

  // TODO Currently the parameters need to each have class "navbar-item". Super sneaky.
  def menu(choices: Seq[JsDom.TypedTag[Anchor]], name: String) =
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
            a(cls := "navbar-link")(name),
            div(cls := "navbar-dropdown")(
              choices.map(_.apply(cls:="navbar-item "))
            ),
          ),
        ),
        div(cls := "navbar-end")(
          ),
      ),
    )

  def card(
            content: JsDom.TypedTag[Div],
            footerItems: Seq[JsDom.TypedTag[Div]],
          ): JsDom.TypedTag[Div] =
    div(
      width := "100%",
      cls := "card",
    )(
      div(cls := "card-content")(
        content,
      ),
      footer(cls := "card-footer")(
        footerItems.map { footerItem =>
          p(cls := "card-footer-item")(
            span(
              footerItem,
            ),
          )

        },
      ),
    )

}
