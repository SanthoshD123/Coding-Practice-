def roman_to_int(roman):
    roman_dict = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
    integer_value = 0
    previous_value = 0

    for char in reversed(roman):
        current_value = roman_dict[char]
        if current_value >= previous_value:
            integer_value += current_value
        else:
            integer_value -= current_value
        previous_value = current_value

    return integer_value

roman_numeral = 'IX'
result = roman_to_int(roman_numeral)
print(f"The integer value of {roman_numeral} is {result}")
