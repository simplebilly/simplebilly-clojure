(ns simple-billy-api.specs.posting-category-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def posting-category-type-data
  {
   })

(def posting-category-type-spec
  (ds/spec
    {:name ::posting-category-type
     :spec posting-category-type-data}))
