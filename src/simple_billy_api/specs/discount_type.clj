(ns simple-billy-api.specs.discount-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def discount-type-data
  {
   })

(def discount-type-spec
  (ds/spec
    {:name ::discount-type
     :spec discount-type-data}))
