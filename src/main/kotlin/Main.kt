package org.example

fun main() {
    print("Masukan angkat dlu:")
    val num1 = readLine()?.toIntOrNull()?:0

    print("Masukan angkat lagi:")
    val num2 = readLine()?.toIntOrNull()?:0

    val sum=num1+num2
    println("Hasil : $sum")
}
echo "# ceva1" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/zxv05/ceva1.git
git push -u origin main