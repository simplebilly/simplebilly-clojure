(ns simple-billy-api.specs.gewerbesteuer-ergebnis
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gewerbesteuer-ergebnis-data
  {
   (ds/req :freibetrag) string?
   (ds/req :gesamtbelastung) string?
   (ds/req :gewerbeertrag) string?
   (ds/req :hebesatz) string?
   (ds/req :jahr) int?
   (ds/req :koerperschaftsteuer) string?
   (ds/req :land) string?
   (ds/req :messbetrag) string?
   (ds/req :steuer) string?
   (ds/req :steuer_art) string?
   })

(def gewerbesteuer-ergebnis-spec
  (ds/spec
    {:name ::gewerbesteuer-ergebnis
     :spec gewerbesteuer-ergebnis-data}))
