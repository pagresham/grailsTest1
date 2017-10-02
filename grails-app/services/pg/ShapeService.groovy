package pg

import grails.gorm.transactions.Transactional

@Transactional
class ShapeService {

    def square() {
        return new Square(height: 250, width: 250, color: "green")
    }
    def circle() {
        return new Circle(diameter: 250, color: "yellow")
    }



}
