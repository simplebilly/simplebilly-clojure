(ns simple-billy-api.specs.emission-target-scope
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def emission-target-scope-data
  {
   })

(def emission-target-scope-spec
  (ds/spec
    {:name ::emission-target-scope
     :spec emission-target-scope-data}))
