
class Human:
    # class (constant) attribute
    MAX_ENERGY = 100


    def __init__(self, name="Human", age=0):
        # instance attributes:
        self.name = name
        self.age = age
        self.energy = Human.MAX_ENERGY

        # instance method:
    def display(self):
        print(f"I am {self.name}")

    def __repr__(self):
        return f"human(name={self.name}, age={self.age}, energy={self.energy})"
    def __str__(self):
        return f"My name is {self.name} and I am {self.age} years old."

    def grow(self):
        self.age += 1

    def eat(self, ammount):
        potential_energy = self.energy + ammount
        if potential_energy > Human.MAX_ENERGY:
            self.energy = Human.MAX_ENERGY
            return  potential_energy - self.energy
        else:
            self.energy = potential_energy
            return 0

    def move(self, distance):
        potential_energy =  self.energy - distance
        if potential_energy < 0:
            self.energy = 0
            return self.energy - abs(potential_energy)
        else:
            self.energy = potential_energy
            return 0










if (__name__ == "__main__"):
  human = Human()
  human.display()


