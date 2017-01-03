class Singlescala private (var state: Int) {
  def DoSomething() = {
    state += 1;
    println("I did something" + this.state)
  }
}

object Singlescala {
  var mInstance: Singlescala = null

  def getInstance(): Singlescala = {

    if ((mInstance == null)) {
      mInstance = new Singlescala(0)
      println("same")
      return mInstance;

    } else {

      println("returned same")
      return mInstance
    }
  }

}

object singleobj {

  def main(args: Array[String]): Unit = {
    val car1 = Singlescala.getInstance()
    //val car2 = new Singlescala()

    // val fastcarlist = List(car1,car2)

  }

  Singlescala.getInstance().DoSomething()

  Singlescala.getInstance().DoSomething()

  Singlescala.getInstance().DoSomething()
}

//Singlescala.getInstance().DoSomething()