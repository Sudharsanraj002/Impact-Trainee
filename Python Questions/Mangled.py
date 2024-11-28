class MyClass:
    def __init__(self):
        self.__private_value = 42

    def __private_method(self):
        print("This is a private method.")

    def public_method(self):
        print("This is a public method.")
        self.__private_method()  # Can be accessed inside the class


# Outside the class
obj = MyClass()
obj.public_method()

# Accessing private method outside the class
# This will raise an AttributeError
try:
    obj.__private_method()  # Raises AttributeError
except AttributeError as e:
    print(f"Error: {e}")

# Accessing private method using name mangling
obj._MyClass__private_method()  # This will work, but it's not recommended
