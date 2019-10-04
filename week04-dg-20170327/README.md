# week04-dg-20170327

#### 課堂練習題目:  
## EX1:
請以課堂範例為例設計一個 `Shape` 的抽象類別及`Measure`的介面:
1. Shape 類別
   - show()函式，顯示物件資訊
2. Measure介面
   - perimeter() 函式
   - area() 函式
   
請分別建立 `Circle`, `Rectangle` 及 `Triangle` 三種類別各自繼承自 `Shape` 抽象類別並實作 `Measure` 介面
針對 `Circle`, `Rectangle` 及 `Triangle` 三種類別 各自產生 3 個物件(實例)

----
#### 作業:
請將 `Person` 類別改成 `Abstract` 類別，同時其需具有 `show()` 的 `abstract` 函式
請設計一個 `CourseManage` 的  Interface (介面)，至少包含下列函式
- Score()
- addCourse()
- delCourse()

`Student`, `Teacher` 及 `Stuff`，繼承自 `Person`並實作(Implement) `CourseManage`的介面
為每一種身份(`Student`, `Teacher`, `Staff`) 都各建立三個實例
