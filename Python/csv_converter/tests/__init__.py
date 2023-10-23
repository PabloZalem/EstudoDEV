import unittest

class Stack:
    def __init__(self):
        self.items = []

    def is_empty(self):
        return len(self.items) == 0 

class TestStack(unittest.TestCase):
    def test_can_create_stack(self):
        stack = Stack()
        self.assertTrue(stack.is_empty())