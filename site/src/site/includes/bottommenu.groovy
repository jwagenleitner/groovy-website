
// footer
footer(id: 'footer') {
    div(class: 'row') {
        div(class: 'colset-3-footer') {
            menu.entrySet().eachWithIndex { entry, i ->
                def (name, menu) = [entry.key, entry.value]
                div(class: "col-${i+1}") {
                    h1(name)
                    ul {
                        menu.each { menuItem ->
                            li { a(href: relative(menuItem.link), menuItem.name) }
                        }
                    }
                }
            }
            div(class: 'col-right') {
                p {
                    yield "The Groovy programming language"; br()
                    yield "is supported by "; a(href: 'http://www.apache.org', 'the Apache Software Foundation'); br()
                    yield "and the Groovy community"; br()
                }
                img(src: 'img/feather.png', title: 'The Apache Software Foundation', alt: 'The Apache Software Foundation')
            }
        }
        div(class: 'clearfix', "&copy; 2003-${Calendar.instance[Calendar.YEAR]} the Groovy project &mdash; Groovy is Open Source, ${$a(href: 'http://www.apache.org/licenses/LICENSE-2.0.html', 'Apache 2 License')}")
    }
}