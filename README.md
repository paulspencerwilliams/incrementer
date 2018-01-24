# incrementer
Just a little re-frame app to test that HMR equivalent in React was supported including app state.

To test, run: 
```
lein clean
lein figwheel dev
```

Inc a few times, and then make an arbitrary change to views.cljs 

A [re-frame](https://github.com/Day8/re-frame) application designed to ... well, that part is up to you.

## Development Mode

### Run application:

```
lein clean
lein figwheel dev
```

Figwheel will automatically push cljs changes to the browser.

Wait a bit, then browse to [http://localhost:3449](http://localhost:3449).

## Production Build


To compile clojurescript to javascript:

```
lein clean
lein cljsbuild once min
```
