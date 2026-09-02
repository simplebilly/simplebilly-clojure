(ns simple-billy-api.specs.gewinnverwendungs-zeile
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gewinnverwendungs-zeile-data
  {
   (ds/req :betrag) string?
   (ds/req :label) string?
   })

(def gewinnverwendungs-zeile-spec
  (ds/spec
    {:name ::gewinnverwendungs-zeile
     :spec gewinnverwendungs-zeile-data}))
