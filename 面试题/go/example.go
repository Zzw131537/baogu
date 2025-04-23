package main

import (
	"fmt"
)

func main() {
	num := 10
	var p *int = &num
	fmt.Println(*p)

	var a [10]int
	a[0] = 1
}
