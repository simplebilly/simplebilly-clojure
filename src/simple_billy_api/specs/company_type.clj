(ns simple-billy-api.specs.company-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def company-type-data
  {
   })

(def company-type-spec
  (ds/spec
    {:name ::company-type
     :spec company-type-data}))
