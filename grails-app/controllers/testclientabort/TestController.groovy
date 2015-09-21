package testclientabort

class TestController {

    def index() {
        byte[] data = "abc".bytes
        Thread.sleep(1000)
        render(file: data, contentType: "application/octet-stream")
    }
}
