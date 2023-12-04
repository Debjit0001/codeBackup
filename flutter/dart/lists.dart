// ignore_for_file: unused_local_variable

void main(List<String> args) {
  // list is an abstract class, so we can't instantiate it
  // by default it's members are dynamic
  List list = [10, 20, 30, 'string', true];

  // print(list);

  List<int> marks = [10, 20, 30, 40];

  final student1 = Student('Debjit');
  final student2 = Student<String>('Paro');

  List<Student> students = [
    Student('Rivaan'),
    Student('Rakesh'),
    Student('Naman')
  ];

  final student = students[0];
  print(student.name);

  // 'is' keyword:
  // ignore: unnecessary_type_check
  if (student is Student) ;

  // is same as
  if (student.runtimeType == Student) ;

  //----------------------methods-------------------------

  print(students);
}

// understanding generics
class Student<T> {
  final T name;

  Student(this.name);

  @override
  String toString() => '$name';
}
