(ns simple-billy-api.specs.budget-kategorie
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def budget-kategorie-data
  {
   (ds/req :budget) string?
   (ds/req :differenz) string?
   (ds/opt :goal) string?
   (ds/req :ist) string?
   (ds/req :kategorie) string?
   })

(def budget-kategorie-spec
  (ds/spec
    {:name ::budget-kategorie
     :spec budget-kategorie-data}))
