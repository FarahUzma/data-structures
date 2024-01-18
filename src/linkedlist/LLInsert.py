class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class LinkedListRotate:
    def __init__(self):
        self.head = None

    def insert(self,data):
        n = Node(data)
        if self.head is None:
           self.head = n
        else:
            p = self.head
            while p .next != None :
                p = p.next
            p.next = n
    
    def display(self):
        p = self.head
        while p!=None:
            print(p.data)
            p=p.next
        

ll = LinkedListRotate()
ll.insert(1)
ll.insert(2)
ll.insert(3)
ll.display()
