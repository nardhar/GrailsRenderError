package sample

class RenderErrorInterceptor {

    RenderErrorInterceptor() {
        matchAll()
    }

    boolean before() {
        println "intercepting: ${controllerName}/${actionName}"
        true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}