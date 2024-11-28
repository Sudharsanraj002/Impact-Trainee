def calculate_discount(member_type, bill_value):
    if member_type == "Premium":
        discount = 0.20 * bill_value
    elif member_type == "Gold":
        discount = 0.15 * bill_value
    elif member_type == "Silver":
        discount = 0.10 * bill_value
    else:
        discount = 0.05 * bill_value if bill_value > 2000 else 0
    return discount
 
print(calculate_discount("Gold", 3000))