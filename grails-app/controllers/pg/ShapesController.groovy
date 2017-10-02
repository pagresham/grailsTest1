package pg

import pg.beans.Circle
import pg.beans.Square

class ShapesController {

    def shapeService


    def index() {
        def colorList = ['red', 'orange', 'yellow', 'green', 'blue', 'purple']
        def sq
        def cr

        if(params.height && params.width && params.color) {

            def ht = Integer.parseInt(params.height)
            def wt = Integer.parseInt(params.width)
            cr = new Circle(diameter: wt, color: params.color)
            sq = new Square(height: ht, width: wt, color: params.color)

        } else {
            sq = shapeService.square()
            cr = shapeService.circle()
        }


        [sq: sq, cr: cr, colors: colorList]
    }
}
