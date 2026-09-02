(ns simple-billy-api.specs.kst-ergebnis
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def kst-ergebnis-data
  {
   (ds/req :gesamt) string?
   (ds/req :gesamtbelastung) string?
   (ds/req :gewerbesteuer) string?
   (ds/req :gewinn) string?
   (ds/req :ist_kapitalgesellschaft) boolean?
   (ds/req :jahr) int?
   (ds/req :koerperschaftsteuer) string?
   (ds/req :solidaritaetszuschlag) string?
   })

(def kst-ergebnis-spec
  (ds/spec
    {:name ::kst-ergebnis
     :spec kst-ergebnis-data}))
