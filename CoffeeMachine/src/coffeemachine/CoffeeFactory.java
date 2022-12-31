/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeemachine;

/**
 *
 * @author HP
 */
public class CoffeeFactory implements CoffeeAbstractFactory {

    // it is responsible for givving diffrent coffee object according to the argument coffeeName
    // this poor factory now relies on diffrent different concreate classes phle kawal 3 thi aur 9 hai 
    
    public Coffee getCoffeeObject(String coffeeName) {
        Coffee coffee;
        if (coffeeName.equals("Cappuccino")) {
            coffee = new Cappuccino(new CappuccinoIngredientFactory());
        } else if (coffeeName.equals("Espresso")) {
            coffee = new Espresso(new EspressoIngredientFactory());
        } else {
            coffee = new Robusta(new RobustaIngredientFactory());
        }
        return coffee;
    }
}

// 1. creational dependency with respect to coffee
// 2. remembering the ingredients 
// mtlb bahut burdan hai iss class per 
// So we need to optimize this can try to reduce burdan of this poor class
// we can create a new class which takes argument and provides the object of ex americanBean daala then it return object of American bean
// By sir we need 3 more factories for bean sugar and milk but we want that our Coffee factory never be change So 
// abstract out ingredient knowledge
// lets take we can create Entity e which holds knowlege of each coffeeType, new Cappuccino(e) 
// e(IngredientFactory) ek interface honga jisse 3 classes implement krege yeh classes hold kregi coffee ki properties ko Bean Sugar Milk 
//
// ab yeh coffeeFactory will never modified hum defaultIngredientFactory bhi bana skte hai jisse hum yaha as an argument pass krwa ske yadi kuch naa ho the 
// yaha hum coffeeFactory ko bina change kiye ingredients badal skte hai 

// This Design Also Called ABSTRACT FACTORY 

// yeh kab use krna chaiye 