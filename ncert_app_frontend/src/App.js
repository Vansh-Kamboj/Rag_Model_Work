import React from 'react';
import HeaderFile from './component/Headerfile'; // Assuming the correct path to HeaderFile component
import LeftGrid from './component/LeftGrid';
import MiddleGrid from './component/MiddleGrid';
import RightGrid from './component/RightGrid';
import './App.css';

function App() {
  return (
    <div>
      <HeaderFile />
      <div className="container">
        <LeftGrid />
        <MiddleGrid />
        <RightGrid />
      </div>
    </div>
  );
}

export default App;
