package sample

import static org.springframework.http.HttpStatus.*

class RenderErrorController {

	static responseFormats = ['json', 'xml']

    def index() {
        println 'entering index'
        render(status: NO_CONTENT)
        return
    }

}