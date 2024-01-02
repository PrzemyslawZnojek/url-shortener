import React from 'react';
import logo from './logo.svg';
import './App.css';
import LinkList from './components/LinkList'

function App() {
  return (
    <div className="App">
      <div className="flex justify-center items-center h-screen bg-auto bg-gradient-to-tr from-cyan-500 to-blue-500">
        <LinkList />
      </div>
    </div>
  );
}

export default App;
