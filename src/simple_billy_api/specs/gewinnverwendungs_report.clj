(ns simple-billy-api.specs.gewinnverwendungs-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.gewinnverwendungs-zeile :refer :all]
            )
  (:import (java.io File)))


(def gewinnverwendungs-report-data
  {
   (ds/req :bilanzgewinn) string?
   (ds/req :gesetzliche_ruecklage_bestand) string?
   (ds/req :gesetzliche_ruecklage_cap) string?
   (ds/req :gesetzliche_ruecklage_nach) string?
   (ds/req :gesetzliche_ruecklage_soll) string?
   (ds/req :gezeichnetes_kapital) string?
   (ds/req :jahresueberschuss) string?
   (ds/req :year) int?
   (ds/req :zeilen) (s/coll-of gewinnverwendungs-zeile-spec)
   })

(def gewinnverwendungs-report-spec
  (ds/spec
    {:name ::gewinnverwendungs-report
     :spec gewinnverwendungs-report-data}))
