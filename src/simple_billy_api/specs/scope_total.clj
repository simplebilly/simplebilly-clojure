(ns simple-billy-api.specs.scope-total
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def scope-total-data
  {
   (ds/req :scope) string?
   (ds/req :tco2e) string?
   })

(def scope-total-spec
  (ds/spec
    {:name ::scope-total
     :spec scope-total-data}))
