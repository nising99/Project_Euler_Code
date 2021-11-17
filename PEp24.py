import itertools

a_list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

permutations_object = itertools.permutations(a_list)

permutations_list = list(permutations_object)

print(permutations_list[999999])
