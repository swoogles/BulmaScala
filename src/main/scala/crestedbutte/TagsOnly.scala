package crestedbutte

import org.scalajs.dom.html.Div
import scalatags.JsDom

object TagsOnly {
  import scalatags.JsDom.all._

  def createPopupContent(content: JsDom.TypedTag[Div]) =
    div(
      div(cls := "overlay light")(
        a(cls := "cancel", href := "#")("x" /*&times*/ ),
        div(cls := "popup")(
          h2("Later Arrivals"),
          div(cls := "content")(
            content,
          ),
        ),
      ),
    )

  def hamburgerMenu() =
    a(role := "button",
      cls := "navbar-burger",
      aria.label := "menu",
      aria.expanded := "false")(
      span(aria.hidden := "true"),
      span(aria.hidden := "true"),
      span(aria.hidden := "true"),
    )

  def createBusTimeElement(
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
