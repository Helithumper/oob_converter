def main():
	userinput = raw_input("what is your input?:")
	print(translate(userinput))
	return

def translate( userin ):
	print(userin)
	output = ""
	vowels = ['a','e','i','o','u','A','E','I','O','U']
	inputarray = list(userin)
	isVowel = False
	for letter in inputarray:
		isVowel = False
		for vowel in vowels:
			if letter==vowel:
				output = output + "oob"
				isVowel = True
		if isVowel == False:
			output = output + letter
	return output

main()
