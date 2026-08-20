class PasswordManager:
    def __init__(self, store: str):
        self.__store = store
    
    # TODO: Implement the verify_password method
    def verify_password(self, y:str) -> bool:
        v = (self.__store == y)
        return v




# Don't modify the code below this line
my_password = PasswordManager("secret123")
print(my_password.verify_password("secret123"))  # Should print: True
print(my_password.verify_password("wrong"))      # Should print: False
