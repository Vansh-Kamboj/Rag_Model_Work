import { createSlice, createSelector } from "@reduxjs/toolkit";
const paramslice = createSlice({
    name: "param",
    initialState: {
        classes: '1',
        subject: 'ENG',
        chapter: '3',
        board: 'CBSE',
        clickbutton: 'notclicked',
    },
    reducers: {
        addItem: (state, action) => {
            const { classes, subject, chapter, board } = action.payload;
            state.classes = classes;
            state.subject = subject;
            state.chapter = chapter;
            state.board = board;
        },
        clickItem: (state, action) => {
            state.clickbutton = action.payload;
        },
    },

});

export const getItemsSelector = createSelector(
    (state) => state.cart,
    (state) => state
);

export const { addItem } = paramslice.actions;
export const { clickItem } = paramslice.actions;
export default paramslice.reducer;
